package com.learnings;

import java.util.concurrent.ConcurrentHashMap;

public final class UrlShortner
{
    final ConcurrentHashMap<String, String> mShortenedUrlCache;

    public UrlShortner()
    {
        mShortenedUrlCache = new ConcurrentHashMap<>();
    }

    public String tinyUrl(final String url)
    {
        String tinyUrl = "";
        mShortenedUrlCache.put(tinyUrl, url);
        return "";
    }

    private String shorten(final String url)
    {

        return "";
    }

    public String resolve(final String tinyUrl)
    {
        return mShortenedUrlCache.get(tinyUrl);
    }

    public String tinyUrl(final String url, final String customString)
    {
        return "" + customString;
    }

    public static void main(String[] args)
    {

    }
}
