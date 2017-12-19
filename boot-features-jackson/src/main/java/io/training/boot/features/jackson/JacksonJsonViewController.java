package io.training.boot.features.jackson;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
public class JacksonJsonViewController {

    @GetMapping("/all")
    public List<User> getAll() {
        List<User> result = get();
        return result;
    }

    @JsonView(View.Basic.class)
    @GetMapping("/basic")
    public List<User> getBasic() {
        List<User> result = get();
        return result;
    }

    @JsonView(View.Secret.class)
    @GetMapping("/secret")
    public List<User> getSecret() {
        List<User> result = get();
        return result;
    }

    @JsonView(View.Parent.class)
    @GetMapping("/parent")
    public List<User> getParent() {
        List<User> result = get();
        return result;
    }

    @JsonView(View.Child.class)
    @GetMapping("/child")
    public List<User> getChild() {
        List<User> result = get();
        return result;
    }
    private List<User> get() {
        List<User> users = new ArrayList<>();

        User user = new User();

        user.setId(1L);
        user.setName("Percy");
        user.setPassword("654321");
        user.setAge(11);
        user.setAddress("北京市朝阳区北辰世纪中心");

        users.add(user);

        user = new User();

        user.setId(2L);
        user.setName("Zhang San");
        user.setPassword("000000");
        user.setAge(12);
        user.setAddress("北京市朝阳区北辰世纪中心");

        users.add(user);
        return users;
    }

    @JsonView(View.Basic.class)
    @GetMapping("/nested")
    public RespData<List<User>> nested() {
        List<User> users = get();
        RespData result = new RespData();
        result.setCode("1");
        result.setResult(users);
        return result;
    }

}
