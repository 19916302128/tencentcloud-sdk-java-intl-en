/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignByAsymmetricKeyRequest extends AbstractModel{

    /**
    * Signature algorithm. Supported algorithm: SM2DSA.
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * The original message or message abstract. For an original message, the length before Base64 encoding can contain up to 4,096 bytes. For a message abstract, the SM2 signature algorithm only supports 32-byte (before Base64 encoding) message abstracts.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Unique ID of a key
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Message type. Valid values: `RAW` (indicating an original message; used by default if the parameter is not passed in) and `DIGEST`.
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
     * Get Signature algorithm. Supported algorithm: SM2DSA. 
     * @return Algorithm Signature algorithm. Supported algorithm: SM2DSA.
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set Signature algorithm. Supported algorithm: SM2DSA.
     * @param Algorithm Signature algorithm. Supported algorithm: SM2DSA.
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get The original message or message abstract. For an original message, the length before Base64 encoding can contain up to 4,096 bytes. For a message abstract, the SM2 signature algorithm only supports 32-byte (before Base64 encoding) message abstracts. 
     * @return Message The original message or message abstract. For an original message, the length before Base64 encoding can contain up to 4,096 bytes. For a message abstract, the SM2 signature algorithm only supports 32-byte (before Base64 encoding) message abstracts.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set The original message or message abstract. For an original message, the length before Base64 encoding can contain up to 4,096 bytes. For a message abstract, the SM2 signature algorithm only supports 32-byte (before Base64 encoding) message abstracts.
     * @param Message The original message or message abstract. For an original message, the length before Base64 encoding can contain up to 4,096 bytes. For a message abstract, the SM2 signature algorithm only supports 32-byte (before Base64 encoding) message abstracts.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Unique ID of a key 
     * @return KeyId Unique ID of a key
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Unique ID of a key
     * @param KeyId Unique ID of a key
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Message type. Valid values: `RAW` (indicating an original message; used by default if the parameter is not passed in) and `DIGEST`. 
     * @return MessageType Message type. Valid values: `RAW` (indicating an original message; used by default if the parameter is not passed in) and `DIGEST`.
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set Message type. Valid values: `RAW` (indicating an original message; used by default if the parameter is not passed in) and `DIGEST`.
     * @param MessageType Message type. Valid values: `RAW` (indicating an original message; used by default if the parameter is not passed in) and `DIGEST`.
     */
    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);

    }
}

