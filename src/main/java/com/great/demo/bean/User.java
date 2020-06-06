package com.great.demo.bean;


import com.alibaba.fastjson.JSON;

public class User
//  用户实体类   取消测试下载更新
{
  private Integer userId;     //id
  private Integer userNum;    //账号
  private String userName;    //用户名
  private String userPass;    //密码
  private String userState;   //状态
  private String userSex;     //性别
  private String userEducation; //学历
  private String userJob;       //职业
  private String userPhone;    //手机号
  private String userEmail;     //邮箱
  private String userRegtime;    //注册时间
  private Integer userScore;     //可用积分
  private Integer levelId;       //等级id

  private String identify;       //验证码

  public User()
  {
  }

  public User(Integer userId, Integer userNum, String userName, String userPass, String userState, String userSex, String userEducation, String userJob, String userPhone, String userEmail, String userRegtime, Integer userScore, Integer levelId, String identify)
  {
    this.userId = userId;
    this.userNum = userNum;
    this.userName = userName;
    this.userPass = userPass;
    this.userState = userState;
    this.userSex = userSex;
    this.userEducation = userEducation;
    this.userJob = userJob;
    this.userPhone = userPhone;
    this.userEmail = userEmail;
    this.userRegtime = userRegtime;
    this.userScore = userScore;
    this.levelId = levelId;
    this.identify = identify;
  }

  public Integer getUserId()
  {
    return userId;
  }

  public void setUserId(Integer userId)
  {
    this.userId = userId;
  }

  public Integer getUserNum()
  {
    return userNum;
  }

  public void setUserNum(Integer userNum)
  {
    this.userNum = userNum;
  }

  public String getUserName()
  {
    return userName;
  }

  public void setUserName(String userName)
  {
    this.userName = userName;
  }

  public String getUserPass()
  {
    return userPass;
  }

  public void setUserPass(String userPass)
  {
    this.userPass = userPass;
  }

  public String getUserState()
  {
    return userState;
  }

  public void setUserState(String userState)
  {
    this.userState = userState;
  }

  public String getUserSex()
  {
    return userSex;
  }

  public void setUserSex(String userSex)
  {
    this.userSex = userSex;
  }

  public String getUserEducation()
  {
    return userEducation;
  }

  public void setUserEducation(String userEducation)
  {
    this.userEducation = userEducation;
  }

  public String getUserJob()
  {
    return userJob;
  }

  public void setUserJob(String userJob)
  {
    this.userJob = userJob;
  }

  public String getUserPhone()
  {
    return userPhone;
  }

  public void setUserPhone(String userPhone)
  {
    this.userPhone = userPhone;
  }

  public String getUserEmail()
  {
    return userEmail;
  }

  public void setUserEmail(String userEmail)
  {
    this.userEmail = userEmail;
  }

  public String getUserRegtime()
  {
    return userRegtime;
  }

  public void setUserRegtime(String userRegtime)
  {
    this.userRegtime = userRegtime;
  }

  public Integer getUserScore()
  {
    return userScore;
  }

  public void setUserScore(Integer userScore)
  {
    this.userScore = userScore;
  }

  public Integer getLevelId()
  {
    return levelId;
  }

  public void setLevelId(Integer levelId)
  {
    this.levelId = levelId;
  }

  public String getIdentify()
  {
    return identify;
  }

  public void setIdentify(String identify)
  {
    this.identify = identify;
  }


  @Override
  public String toString()
  {
	  return JSON.toJSONString(this);
  }
}
