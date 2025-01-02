/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.example.controllers;

import com.example.facts.StringFact;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;

@QuarkusTest
public class RestQueryTest {

    @Test
    public void testGroup1Endpoint() {
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body("{\"facts\":[{\"myT\":\"1\"}]}")
                .when()
                .post("/facts1")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void testGroup2Endpoint() {
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body("{\"facts\":[{\"myT\":2}]}")
                .when()
                .post("/facts2")
                .then()
                .statusCode(200)
                .log().all();
    }
}
