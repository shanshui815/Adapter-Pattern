# Adapter-Pattern 适配器模式
<font color=#ff0000>（亡羊补牢的过程，由于接口不匹配产生）</font>
***

## 问题
>> 想使用一个<font color=#ff0000>已存在的类</font>
>> 但它的接口不符合要求

## 适配器的四种角色
* target
* adaptee
* adapter
* Client(客户端或者main方法)

## 适配器模式分类
* 类
	* 类适配器采用“多继承”的实现方式，带来了不良的高耦合/<br> 
	* 类适配器无法面对多个被适配对象。耦合度高，违背了合成复用原则

* 对象
	* 对象适配器采用“对象组合”的方式，更符合松耦合精神
![适配器模式分类](https://github.com/zhangxixian/Adapter-Pattern/blob/master/img/adapter_pattern_type.png) 

## 我的代码环境
>> 游戏中的坐骑——五彩神鹿
>> 第一世界它的行走方式为奔跑，第二世界它的行走方式为飞！

