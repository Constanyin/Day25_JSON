package com.qf.json;

import com.qf.entity.Score;
import com.qf.entity.Student;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

// 把对象转换成 json 格式的数据
public class Demo02 {
    @Test
    public void test01(){
        //1.简单的对象
        Score score = new Score(45.0, 34.0);
        JSONObject json = new JSONObject(score);
        System.out.println(json.toString());

        //2.复杂的对象
        Student stu = new Student("zs", 19, score);
        JSONObject json1 = new JSONObject(stu);
        System.out.println(json1);

        //3.把集合转换成 json 格式对象
        List<Score> list = new ArrayList();
        list.add(new Score(24.5,11.5));
        list.add(new Score(56.5,86.5));
        JSONArray array = new JSONArray(list);
        System.out.println(array);
    }
}
