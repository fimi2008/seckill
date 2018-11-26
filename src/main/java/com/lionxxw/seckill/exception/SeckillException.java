package com.lionxxw.seckill.exception;

/**
 * 秒杀相关业务异常
 * Package com.lionxxw.seckill.exception
 * Project seckill

 * Author lionxxw
 * Created on 2017/2/28 16:59
 * version 1.0.0
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
