package com.java.eight;

/**
 * 在接口前加上@FunctionalInterface 标注。
 * 编译器会注意到这个标注，
 * 如果你的接口中定义了第二个抽象方法的话，编译器会抛出异常。
 */
//@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);

}

class ConverterDemo{

    public static void main(String[] args) {
        Converter<String, Integer> converter = from -> Integer.valueOf(from);
        try {
            Integer convert = converter.convert("11");
            System.err.println(convert);
        } catch (Exception e) {
            System.err.println(-1);
            System.err.println(e);
        }
    }
}
