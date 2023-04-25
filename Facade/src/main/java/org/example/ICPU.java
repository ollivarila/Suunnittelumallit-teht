package org.example;

public interface ICPU {
    void freeze();
    void jump(int position);
    void execute();
}
