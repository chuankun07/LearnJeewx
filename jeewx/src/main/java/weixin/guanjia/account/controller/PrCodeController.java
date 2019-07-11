package weixin.guanjia.account.controller;

import org.apache.log4j.Logger;
import org.jeecgframework.core.common.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import weixin.guanjia.account.service.PrCodeServiceI;

@Controller
@RequestMapping("/prCodeController")
public class PrCodeController extends BaseController {
    /**
     * Logger for this class
     */
    private static final Logger logger = Logger
            .getLogger(WeixinAccountController.class);

    @Autowired
    private PrCodeServiceI prCodeService;
}
