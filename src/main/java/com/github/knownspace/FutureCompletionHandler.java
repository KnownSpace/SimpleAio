package com.github.knownspace;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.CompletableFuture;

public class FutureCompletionHandler<R> implements CompletionHandler<R,CompletableFuture<R>> {

    @Override
    public void completed(R result, CompletableFuture<R> future) {
        future.complete(result);
    }

    @Override
    public void failed(Throwable exc, CompletableFuture<R> future) {
        future.completeExceptionally(exc);
    }
}