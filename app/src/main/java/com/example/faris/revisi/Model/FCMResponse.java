package com.example.faris.revisi.Model;

import java.util.List;

public class FCMResponse {

    public long multicast_id;
    public int success;
    public int failure;
    public int canonical_ida;
    public List<Result> results;

    public FCMResponse(){

    }

    public FCMResponse(long multicast_id, int success, int failure, int canonical_ida, List<Result> results) {
        this.multicast_id = multicast_id;
        this.success = success;
        this.failure = failure;
        this.canonical_ida = canonical_ida;
        this.results = results;
    }

    public long getMulticast_id() {
        return multicast_id;
    }

    public void setMulticast_id(long multicast_id) {
        this.multicast_id = multicast_id;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getFailure() {
        return failure;
    }

    public void setFailure(int failure) {
        this.failure = failure;
    }

    public int getCanonical_ida() {
        return canonical_ida;
    }

    public void setCanonical_ida(int canonical_ida) {
        this.canonical_ida = canonical_ida;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
