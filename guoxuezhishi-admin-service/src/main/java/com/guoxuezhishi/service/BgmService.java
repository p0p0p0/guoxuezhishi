package com.guoxuezhishi.service;

import com.guoxuezhishi.pojo.wechat.Bgm;

import java.util.List;

public interface BgmService {
    /**
     * 查询背景音乐列表
     */
    public List<Bgm> queryBgmList();

}
