package weixin.guanjia.account.service.impl;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import weixin.guanjia.account.service.PrCodeServiceI;

@Service("prCodeService")
@Transactional
public class PrCodeServiceImpl extends CommonServiceImpl implements PrCodeServiceI {
}
