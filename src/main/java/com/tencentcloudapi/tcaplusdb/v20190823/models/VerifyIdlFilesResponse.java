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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyIdlFilesResponse extends AbstractModel{

    /**
    * Information list of all IDL files uploaded and verified in this request
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
    * Number of valid tables parsed by reading IDL description file, excluding tables already created
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of valid tables parsed by reading IDL description file, excluding tables already created
    */
    @SerializedName("TableInfos")
    @Expose
    private ParsedTableInfoNew [] TableInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information list of all IDL files uploaded and verified in this request 
     * @return IdlFiles Information list of all IDL files uploaded and verified in this request
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * Set Information list of all IDL files uploaded and verified in this request
     * @param IdlFiles Information list of all IDL files uploaded and verified in this request
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * Get Number of valid tables parsed by reading IDL description file, excluding tables already created 
     * @return TotalCount Number of valid tables parsed by reading IDL description file, excluding tables already created
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of valid tables parsed by reading IDL description file, excluding tables already created
     * @param TotalCount Number of valid tables parsed by reading IDL description file, excluding tables already created
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of valid tables parsed by reading IDL description file, excluding tables already created 
     * @return TableInfos List of valid tables parsed by reading IDL description file, excluding tables already created
     */
    public ParsedTableInfoNew [] getTableInfos() {
        return this.TableInfos;
    }

    /**
     * Set List of valid tables parsed by reading IDL description file, excluding tables already created
     * @param TableInfos List of valid tables parsed by reading IDL description file, excluding tables already created
     */
    public void setTableInfos(ParsedTableInfoNew [] TableInfos) {
        this.TableInfos = TableInfos;
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

    public VerifyIdlFilesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyIdlFilesResponse(VerifyIdlFilesResponse source) {
        if (source.IdlFiles != null) {
            this.IdlFiles = new IdlFileInfo[source.IdlFiles.length];
            for (int i = 0; i < source.IdlFiles.length; i++) {
                this.IdlFiles[i] = new IdlFileInfo(source.IdlFiles[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TableInfos != null) {
            this.TableInfos = new ParsedTableInfoNew[source.TableInfos.length];
            for (int i = 0; i < source.TableInfos.length; i++) {
                this.TableInfos[i] = new ParsedTableInfoNew(source.TableInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "IdlFiles.", this.IdlFiles);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TableInfos.", this.TableInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

