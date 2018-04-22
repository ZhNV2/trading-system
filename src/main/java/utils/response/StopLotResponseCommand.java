package utils.response;

import http.HttpResponse;
import utils.API;

public class StopLotResponseCommand implements ResponseCommand {
    private final String executionResult;

    public StopLotResponseCommand(HttpResponse httpResponse) {
    }

    @Override
    public HttpResponse toHttpResponse() {
        return null;
    }

    @Override
    public API getAPI() {
        return API.STOP_LOT;
    }

    @Override
    public String getExecutionResult() {
        return executionResult;
    }
}