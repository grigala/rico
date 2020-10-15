/*
 * Copyright 2018-2019 Karakun AG.
 * Copyright 2015-2018 Canoo Engineering AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.rico.core.http;

import org.apiguardian.api.API;

import java.net.HttpURLConnection;

import static org.apiguardian.api.API.Status.EXPERIMENTAL;

/**
 * Handler interface that can withoutResult a url connection.
 * An implemntation can add header values for example.
 */
@API(since = "0.x", status = EXPERIMENTAL)
@FunctionalInterface
public interface HttpURLConnectionHandler {

    void handle(HttpURLConnection connection);

}