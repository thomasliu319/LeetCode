package io.algorithm.tinyurl;

import java.util.HashMap;
import java.util.Map;

/**
 * TinyURL是一种URL简化服务， 比如：当你输入一个URLhttps://leetcode.com/problems/design-tinyurl时，它将返回一个简化的URLhttp://tinyurl.com/4e9iAk.
 *
 * 要求：设计一个 TinyURL 的加密encode和解密decode的方法。你的加密和解密算法如何设计和运作是没有限制的，你只需要保证一个URL可以被加密成一个TinyURL，并且这个TinyURL可以用解密方法恢复成原本的URL。
 *
 */
public class Codec {

    Map<String, String> map = new HashMap<String, String>();
    static final String INDEX = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String TINYURL_PREFIX = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl){
        char[] chs = new char[6];
        while(true){
            for(int i =0; i< 6; i++){
                chs[i] = INDEX.charAt((int)Math.random()*62);
            }
            String shortUrl = TINYURL_PREFIX + new String(chs);
            if(!map.containsKey(shortUrl)){
                map.put(shortUrl, longUrl);
                return shortUrl;
            }
        }
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl){
        return map.get(shortUrl);
    }


}
