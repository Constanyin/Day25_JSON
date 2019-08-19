package com.qf.json;

import com.qf.entity.Score;
import com.qf.entity.Student;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
/*
 *   json:前后端数据传输的一种格式,本质上是字符串
 *
 *   var json = {name:'zs',age:18};
 *
 * */



//解析请求过来的 json 格式数据
public class Demo01 {
    //1. 解析简单的 json 格式
    public static void main(String[] args) throws JSONException {
        //json 格式的数据
        String json = "{name:'zs',age:18}";
        //json 解析对象,包含了需要解析的对象
        JSONObject obj = new JSONObject(json);
        String name = obj.getString("name");
        int age = obj.getInt("age");
        System.out.println(name+":"+age);
    }

    //2.解析复杂的 json 对象
    @Test
    public void test01() throws JSONException {
        String json = "{name:'zs',age:18,score:{java:88,H5:100}}";
        //创建 JSONObject对象
        JSONObject obj = new JSONObject(json);
        String name = obj.getString("name");
        int age = obj.getInt("age");
        JSONObject newObj = obj.getJSONObject("score");
        double java = newObj.getDouble("java");
        double h5 = newObj.getDouble("H5");
        Student stu = new Student(name,age,new Score(java,h5));
        System.out.println(stu);
    }

    //3.解析数组类型的 json 格式
    @Test
    public void test02() throws JSONException {
        String json ="[{java:99,H5:88},{java:77,H5:33}]";
        JSONArray array = new JSONArray(json);
        List<Score> list = new ArrayList();
        for (int i = 0;i < array.length();i++){
            //根据索引获取 json 对象
            JSONObject obj = array.getJSONObject(i);
            double java = obj.getDouble("java");
            double h5 = obj.getDouble("H5");
            Score score = new Score(java, h5);
            list.add(score);
        }
        System.out.println(list);
    }
}
