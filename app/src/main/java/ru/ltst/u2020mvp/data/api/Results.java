package ru.ltst.u2020mvp.data.api;

import retrofit2.adapter.rxjava.Result;
import rx.functions.Func1;

public final class Results {
    private static final Func1<Result<?>, Boolean> SUCCESSFUL =
            result -> !result.isError() && result.response().isSuccess();

    public static Func1<Result<?>, Boolean> isSuccessful() {
        return SUCCESSFUL;
    }

    private Results() {
        throw new AssertionError("No instances.");
    }
}