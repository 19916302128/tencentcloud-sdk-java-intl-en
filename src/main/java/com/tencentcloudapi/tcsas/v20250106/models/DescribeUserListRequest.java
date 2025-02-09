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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserListRequest extends AbstractModel {

    /**
    * Page offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Keywords for search (username or account)
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * User account 1 - Super admin 2 - Platform admin 3 - Member
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * Team ID
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
     * Get Page offset 
     * @return Offset Page offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset
     * @param Offset Page offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results per page 
     * @return Limit Number of results per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page
     * @param Limit Number of results per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Keywords for search (username or account) 
     * @return Keyword Keywords for search (username or account)
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keywords for search (username or account)
     * @param Keyword Keywords for search (username or account)
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get User account 1 - Super admin 2 - Platform admin 3 - Member 
     * @return AccountType User account 1 - Super admin 2 - Platform admin 3 - Member
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set User account 1 - Super admin 2 - Platform admin 3 - Member
     * @param AccountType User account 1 - Super admin 2 - Platform admin 3 - Member
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get Team ID 
     * @return TeamId Team ID
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID
     * @param TeamId Team ID
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    public DescribeUserListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserListRequest(DescribeUserListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);

    }
}

