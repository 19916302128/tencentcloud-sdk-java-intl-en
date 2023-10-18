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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPackageChannelsResponse extends AbstractModel {

    /**
    * List of channel information
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Infos")
    @Expose
    private ChannelInfo [] Infos;

    /**
    * Page number
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Number of entries per page
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number of entries
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * Total number of pages
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of channel information
Note: this field may return `null`, indicating that no valid value was found. 
     * @return Infos List of channel information
Note: this field may return `null`, indicating that no valid value was found.
     */
    public ChannelInfo [] getInfos() {
        return this.Infos;
    }

    /**
     * Set List of channel information
Note: this field may return `null`, indicating that no valid value was found.
     * @param Infos List of channel information
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setInfos(ChannelInfo [] Infos) {
        this.Infos = Infos;
    }

    /**
     * Get Page number 
     * @return PageNum Page number
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number
     * @param PageNum Page number
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Number of entries per page 
     * @return PageSize Number of entries per page
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page
     * @param PageSize Number of entries per page
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number of entries 
     * @return TotalNum Total number of entries
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total number of entries
     * @param TotalNum Total number of entries
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get Total number of pages 
     * @return TotalPage Total number of pages
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set Total number of pages
     * @param TotalPage Total number of pages
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeStreamPackageChannelsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageChannelsResponse(DescribeStreamPackageChannelsResponse source) {
        if (source.Infos != null) {
            this.Infos = new ChannelInfo[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new ChannelInfo(source.Infos[i]);
            }
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

