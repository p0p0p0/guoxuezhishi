package com.guoxuezhishi.controller.ssh;

import ch.ethz.ssh2.Connection;
import com.guoxuezhishi.utils.GXJSONResult;
import com.guoxuezhishi.utils.RemoteCommandUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jiang
 * @date: 2019/8/12
 */
@RestController
@Api(value = "Command连接", tags = "Command连接")
public class CommandController {
    @PostMapping("/CgdgwCommand")
    @ApiOperation(value = "CgdgwCommand", notes = " CgdgwCommand")
    @ApiImplicitParam(name = "cmd", value = "命令", defaultValue = "sendmsg bpcspub3  cloudCheckFile -d \"request_time=20190812121212&check_date=20190809\"", required = true, dataType = "String",paramType = "query")
    public GXJSONResult cgdgwCommand(String cmd) {
        String ip = "202.106.235.34";
        int port = 10022;
        String userName = "cgdgw";
        String userPwd = "cgdgw@st";
        String head = "source /etc/profile && source /home/gsdpay/.bash_profile && ";
        cmd = head + cmd;
        Connection conn = RemoteCommandUtil.login(ip, port, userName, userPwd);
        String execute = RemoteCommandUtil.execute(conn, cmd);
        System.out.println("执行结果为：" + execute);
        return GXJSONResult.ok(execute);
    }

    @PostMapping("/GsdpayCommand")
    @ApiOperation(value = "GsdpayCommand", notes = " GsdpayCommand")
    @ApiImplicitParam(name = "cmd", value = "命令", defaultValue = "sendmsg bpcspub3  cloudCheckFile -d \"request_time=20190812121212&check_date=20190809\"", required = true, dataType = "String",paramType = "query")
    public GXJSONResult gsdpayCommand(String cmd) {
        String ip = "202.106.235.34";
        int port = 10022;
        String userName = "gsdpay";
        String userPwd = "gsdpay@st";
        String head = "source /etc/profile && source /home/gsdpay/.bash_profile && ";
        cmd = head + cmd;
        Connection conn = RemoteCommandUtil.login(ip, port, userName, userPwd);
        String execute = RemoteCommandUtil.execute(conn, cmd);
        System.out.println("执行结果为：" + execute);
        return GXJSONResult.ok(execute);
    }

}
