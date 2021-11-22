/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventmesh-client.proto

package org.apache.eventmesh.client.grpc.protos;

/**
 * RequestHeaderOrBuilder interface.
 */
public interface RequestHeaderOrBuilder extends com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string env = 1.</code>
     */
    String getEnv();

    /**
     * <code>string env = 1.</code>
     */
    com.google.protobuf.ByteString getEnvBytes();

    /**
     * <code>string region = 2.</code>
     */
    String getRegion();

    /**
     * <code>string region = 2.</code>
     */
    com.google.protobuf.ByteString getRegionBytes();

    /**
     * <code>string idc = 3.</code>
     */
    String getIdc();

    /**
     * <code>string idc = 3.</code>
     */
    com.google.protobuf.ByteString getIdcBytes();

    /**
     * <code>string ip = 4.</code>
     */
    String getIp();

    /**
     * <code>string ip = 4.</code>
     */
    com.google.protobuf.ByteString getIpBytes();

    /**
     * <code>string pid = 5.</code>
     */
    String getPid();

    /**
     * <code>string pid = 5.</code>
     */
    com.google.protobuf.ByteString getPidBytes();

    /**
     * <code>string sys = 6.</code>
     */
    String getSys();

    /**
     * <code>string sys = 6.</code>
     */
    com.google.protobuf.ByteString getSysBytes();

    /**
     * <code>string username = 7.</code>
     */
    String getUsername();

    /**
     * <code>string username = 7.</code>
     */
    com.google.protobuf.ByteString getUsernameBytes();

    /**
     * <code>string password = 8.</code>
     */
    String getPassword();

    /**
     * <code>string password = 8.</code>
     */
    com.google.protobuf.ByteString getPasswordBytes();

    /**
     * <code>string version = 9.</code>
     */
    String getVersion();

    /**
     * <code>string version = 9.</code>
     */
    com.google.protobuf.ByteString getVersionBytes();

    /**
     * <code>string language = 10.</code>
     */
    String getLanguage();

    /**
     * <code>string language = 10.</code>
     */
    com.google.protobuf.ByteString getLanguageBytes();

    /**
     * <code>string seqNum = 11.</code>
     */
    String getSeqNum();

    /**
     * <code>string seqNum = 11.</code>
     */
    com.google.protobuf.ByteString getSeqNumBytes();
}