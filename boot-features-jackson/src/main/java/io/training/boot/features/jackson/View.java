package io.training.boot.features.jackson;

public class View {
    public interface Basic {}
    public enum Secret{}

    public interface Parent{}
    public interface Child extends Parent{}
}
