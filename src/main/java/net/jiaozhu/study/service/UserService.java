package net.jiaozhu.study.service;

import lombok.extern.slf4j.Slf4j;
import net.jiaozhu.study.event.UserRegisterEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void register(String username){
        log.info("[register][执行用户({}) 的注册逻辑]", username);
        applicationEventPublisher.publishEvent(new UserRegisterEvent(this, username));
    }
}
