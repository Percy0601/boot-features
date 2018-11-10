package io.training.boot.features.test.spock

import io.training.boot.features.test.FeatureService
import io.training.boot.features.test.User
import io.training.boot.features.test.UserRepo
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title

@Title("测试的标题")
@Narrative("""关于测试的大段文本描述""")
@Subject(FeatureService)  //标明被测试的类
//@Stepwise  //当测试方法间存在依赖关系时，标明测试方法将严格按照其在源代码中声明的顺序执行
class FeaturesSpec extends Specification{

    public Logger log = LoggerFactory.getLogger(this.getClass());

    def "依赖级联测试"() {
        log.info("测试=======依赖级联测试")

        setup:
        UserRepo userRepo =  Mock(UserRepo);
        User user = new User();
        user.with {
            id = 123
            name = 'SomeOne'
        }

        FeatureService featureService = new FeatureService()
        featureService.userRepo = userRepo

        1 * userRepo.get(123) >> user

        when:
        User result = featureService.findOne(123)

        then:
        result == user

    }
    /**
     *  使用when-then进行参数化测试
     *
     *
     *
     */
    def "参数化测试"() {
        when:
        FeatureService featureService = new FeatureService()
        then:
        featureService.add(a, b) == sum
        where:
        a   |   b   |  sum
        1   |   2   |  3
        1   |   3   |  4
    }

    def "模拟异常"() {

        given:
        FeatureService featureService = Mock(FeatureService)
        and:
        featureService.findOne(1) >> {
            throw new RuntimeException("哈哈，中计了")
        }

        when: "踩坑"
        featureService.findOne(1)
        then: "validator"
        RuntimeException runtimeException = thrown(RuntimeException)
        runtimeException.message == "哈哈，中计了"
    }



}
