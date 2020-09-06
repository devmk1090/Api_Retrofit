package com.devkproject.apiretrofit.php;

//<?php
//
////-> : 객체의 속성에 접근하는 지시자, $this 와 함께 변수 초기화에도 사용
//class DbConnect{
//    private $con;
//
//    function connect(){
//        include_once dirname(__FILE__) . '/Constants.php';
//
//        //mysqli() : 서버 접속을 위해 (서버명, 사용자id, 패스워드, 데이터베스 명) 사용
//        $this->con = new mysqli(DB_HOST, DB_USER, DB_PASSWORD, DB_NAME);
//
//        if(mysqli_connect_errno()){
//            echo "Failed to connect " . mysqli_connect_error();
//            return null;
//        }
//
//        return $this->con;
//    }
//}