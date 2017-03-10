package com.framework.cache.test;

import com.framework.cache.CacheManager;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jackjiang on 16/11/7.
 */
public class CacheManagerTest {

    /**
     * 往缓存中塞数据
     */
    @Test
    public void putTest(){
        CacheManager cacheManager = CacheManager.getInstance().putListener();
        cacheManager.put("aaa","aaaa");
        Assert.assertEquals("缓存中的数据一定是",cacheManager.get("aaa"),"aaaa");
    }

    /**
     * 获取缓存中的数据
     */
    @Test
    public void getTest() {
        CacheManager cacheManager = CacheManager.getInstance().putListener();
        System.out.print(cacheManager.get("aaa"));
    }

    /**
     * 手动删除缓存中的数据
     */
    @Test
    public void removeTest() {
        CacheManager cacheManager = CacheManager.getInstance().removeListener();
        cacheManager.remove("aaa");
    }

    /**
     * 通过定时任务删除缓存数据
     */
    @Test
    public void timeoutRemoveTest(){
        CacheManager cacheManager = CacheManager.getInstance().putListener().removeListener();
        cacheManager.put("bbb","bbb",10);
        cacheManager.put("ccc","bbb",10);
        cacheManager.put("ddd","bbb",10);
        cacheManager.put("eee","bbb",10);
        cacheManager.put("fff","bbb",10);
        try {
            Thread.sleep(1000*20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}
