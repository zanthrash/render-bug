package com.bug

import grails.converters.JSON

class TestController {

    def index = { }

    def good = {

        def json = [text:"This is a good requst"]
        render text: json as JSON, contentType:'application/json'
    }


    def bad = {
        def json = [text:"This should cause a MethodMissingException"]
        render json as JSON, contentType:'application/json'
    }
}
