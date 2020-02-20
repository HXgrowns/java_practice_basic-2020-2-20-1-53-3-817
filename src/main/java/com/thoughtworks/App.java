package com.thoughtworks;

public class App {

    public static void main(String[] args) {
        Student student = null;
        MemoryRepository<Student> memoryRepository = new MemoryRepository<>();
        student = new Student("3", "张三");
        memoryRepository.save(student.getId(), student);
        student = new Student("4", "李四");
        memoryRepository.save(student.getId(), student);
        student = new Student("5", "王五");
        memoryRepository.save(student.getId(), student);
        student = new Student("6", "赵六");
        memoryRepository.save(student.getId(), student);
        student = new Student("7", "钱七");
        memoryRepository.save(student.getId(), student);

        System.out.println(memoryRepository.get("3"));

        memoryRepository.delete("4");

        student = new Student("5", "冯五");
        memoryRepository.update(student.getId(), student);

        RepositoryUtil.printList(memoryRepository.list());
    }
}
