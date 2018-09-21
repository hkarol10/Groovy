//It's build code into HTML
package com.paczka
import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()

builder.sports {
    sport(id:1){
        name 'Baseball'
    }
    sport(id:2){
        name 'Rugby'
    }
    sport(id:3){
        name 'football'
    }
    sport(id:null){
        name 'null '
    }
}