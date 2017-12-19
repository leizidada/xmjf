package com.shsxt.xm.api.service;

        import com.shsxt.xm.api.dto.PayDto;
        import com.shsxt.xm.api.po.BusAccount;
        import org.springframework.web.bind.annotation.RequestParam;

        import javax.servlet.http.HttpSession;
        import java.math.BigDecimal;

/**
 * Created by leizidada on 2017/12/15.
 */
public interface IBusAccountService {

    public BusAccount queryBusAccountByUserId(Integer userId);

    public PayDto addRechargeRequestInfo(BigDecimal amount,  String bussinessPassword,Integer userId);

    public void updateAccountRecharge(Integer userId, BigDecimal totalFee
            ,String outOrderNo,String sign, String  tradeNo, String  tradeStatus);
}
