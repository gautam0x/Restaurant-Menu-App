package com.gautam.foodapp

class Food
{
    var name:String?=null
    var desc:String?=null
    var img:Int?=null

    constructor(name:String,desc:String,img:Int)
    {
        this.name = name
        this.desc = desc
        this.img = img
    }
}