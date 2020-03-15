package com.weipt.service;

import java.util.concurrent.Future;

public interface IAsyncService {

    public Future<String> doTask1() throws Exception;

    public Future<String> doTask2() throws Exception;

    public Future<String> doTask3() throws Exception;

}
