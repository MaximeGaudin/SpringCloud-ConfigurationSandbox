package com.mgaudin.sandbox.config.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SampleReloadableClass implements ApplicationListener<RefreshScopeRefreshedEvent> {
    @Override
    public void onApplicationEvent(RefreshScopeRefreshedEvent event) {
        log.warn("Reloading !");
    }
}
