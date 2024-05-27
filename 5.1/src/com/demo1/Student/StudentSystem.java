package com.demo1.Student;

import java.util.Scanner;
import java.util.Vector;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Student> stu = new Vector<>();
        loop : while (true) {
            int num = sc.nextInt();
            switch (num) {
                case 1 -> addStudent(stu);
                case 2 -> deleteStudent(stu);
                case 3 -> updateStudent(stu);
                case 4 -> queryStudent(stu);
                case 5 -> {
                    break loop;
                }
                default ->{
                    System.out.println("请重新输入");
                }
                }
            }
        }
    public static void addStudent(Vector<Student> stu){
        Scanner sc  = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(stu,id);
        if(index>=0){
            System.out.println("重新输入，id已经存在");
            return;
        }else {
            String name = sc.next();
            int age = sc.nextInt();
            String address = sc.next();
            Student st = new Student(id, name, age, address);
            stu.add(st);
            System.out.println("添加成功");
        }
    }

    public static void queryStudent(Vector<Student> stu){
        if(stu.size()==0){
            System.out.println("当前无学生信息");
        }else{
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for(int i = 0; i<stu.size();i++){
                Student st = stu.get(i);
                System.out.println(st.getId()+"\t"+st.getName()+"\t"+st.getAge()+"\t"+st.getAddress());
            }
        }
    }
    public static void deleteStudent(Vector<Student> stu){
        Scanner sc  = new Scanner(System.in);
        String id = sc.next();
        int num = getIndex(stu,id);
        if(num>=0){
            stu.remove(num);
            System.out.println("删除成功");
        }else {
            System.out.println("当前id不存在");
            return;
        }
    }

    public static void updateStudent(Vector<Student> stu){
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int num = getIndex(stu, id);
        if(num>=0){
            Student st = stu.get(num);

            String name = sc.next();
            int age = sc.nextInt();
            String address = sc.next();
            st.setName(name);
            st.setAge(age);
            st.setAddress(address);
            System.out.println("修改成功");
        }else {
            System.out.println("id不存在");
            return;
        }
    }

    public static int getIndex(Vector<Student> stu, String id){
        for(int i = 0; i<stu.size(); i++){
            Student st = stu.get(i);
            if(st.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}

