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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpsTaskInfoPage extends AbstractModel {

    /**
    * Page Number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page Size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Task List Information
    */
    @SerializedName("Items")
    @Expose
    private TaskOpsDto [] Items;

    /**
    * Total Pages
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * Page Number
    */
    @SerializedName("PageCount")
    @Expose
    private Long PageCount;

    /**
    * Total number of items
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get Page Number 
     * @return PageNumber Page Number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page Number
     * @param PageNumber Page Number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page Size 
     * @return PageSize Page Size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page Size
     * @param PageSize Page Size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Task List Information 
     * @return Items Task List Information
     */
    public TaskOpsDto [] getItems() {
        return this.Items;
    }

    /**
     * Set Task List Information
     * @param Items Task List Information
     */
    public void setItems(TaskOpsDto [] Items) {
        this.Items = Items;
    }

    /**
     * Get Total Pages 
     * @return TotalPage Total Pages
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set Total Pages
     * @param TotalPage Total Pages
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get Page Number 
     * @return PageCount Page Number
     */
    public Long getPageCount() {
        return this.PageCount;
    }

    /**
     * Set Page Number
     * @param PageCount Page Number
     */
    public void setPageCount(Long PageCount) {
        this.PageCount = PageCount;
    }

    /**
     * Get Total number of items 
     * @return TotalCount Total number of items
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of items
     * @param TotalCount Total number of items
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public OpsTaskInfoPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsTaskInfoPage(OpsTaskInfoPage source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Items != null) {
            this.Items = new TaskOpsDto[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TaskOpsDto(source.Items[i]);
            }
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.PageCount != null) {
            this.PageCount = new Long(source.PageCount);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "PageCount", this.PageCount);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

