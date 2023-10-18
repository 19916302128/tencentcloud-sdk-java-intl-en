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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReceiverDetailRequest extends AbstractModel {

    /**
    * Recipient group ID
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * Email address
    */
    @SerializedName("Emails")
    @Expose
    private String [] Emails;

    /**
     * Get Recipient group ID 
     * @return ReceiverId Recipient group ID
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set Recipient group ID
     * @param ReceiverId Recipient group ID
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get Email address 
     * @return Emails Email address
     */
    public String [] getEmails() {
        return this.Emails;
    }

    /**
     * Set Email address
     * @param Emails Email address
     */
    public void setEmails(String [] Emails) {
        this.Emails = Emails;
    }

    public CreateReceiverDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReceiverDetailRequest(CreateReceiverDetailRequest source) {
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.Emails != null) {
            this.Emails = new String[source.Emails.length];
            for (int i = 0; i < source.Emails.length; i++) {
                this.Emails[i] = new String(source.Emails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamArraySimple(map, prefix + "Emails.", this.Emails);

    }
}

