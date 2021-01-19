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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBlackListRequest extends AbstractModel{

    /**
    * List of email addresses to be unblocklisted. Enter at least one address.
    */
    @SerializedName("EmailAddressList")
    @Expose
    private String [] EmailAddressList;

    /**
     * Get List of email addresses to be unblocklisted. Enter at least one address. 
     * @return EmailAddressList List of email addresses to be unblocklisted. Enter at least one address.
     */
    public String [] getEmailAddressList() {
        return this.EmailAddressList;
    }

    /**
     * Set List of email addresses to be unblocklisted. Enter at least one address.
     * @param EmailAddressList List of email addresses to be unblocklisted. Enter at least one address.
     */
    public void setEmailAddressList(String [] EmailAddressList) {
        this.EmailAddressList = EmailAddressList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EmailAddressList.", this.EmailAddressList);

    }
}

