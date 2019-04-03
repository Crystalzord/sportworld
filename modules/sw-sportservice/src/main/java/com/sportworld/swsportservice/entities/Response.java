package com.sportworld.swsportservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Response {

    @JsonIgnore
    private Long id;

    private String service;
    private String msg;

    public Response() {
    }

    public Response(String service, String msg) {
        this.service = service;
        this.msg = msg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}