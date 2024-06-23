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

public class CreateHiveTableRequest extends AbstractModel {

    /**
    * Data source ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Database name
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * Base64-encoded Table Creation Statement
    */
    @SerializedName("DDLSql")
    @Expose
    private String DDLSql;

    /**
    * Table permissions, default is 0: Project share; 1: Individual and administrator only
    */
    @SerializedName("Privilege")
    @Expose
    private Long Privilege;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Person in Charge
    */
    @SerializedName("Incharge")
    @Expose
    private String Incharge;

    /**
     * Get Data source ID 
     * @return DatasourceId Data source ID
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data source ID
     * @param DatasourceId Data source ID
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Database name 
     * @return Database Database name
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set Database name
     * @param Database Database name
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get Base64-encoded Table Creation Statement 
     * @return DDLSql Base64-encoded Table Creation Statement
     */
    public String getDDLSql() {
        return this.DDLSql;
    }

    /**
     * Set Base64-encoded Table Creation Statement
     * @param DDLSql Base64-encoded Table Creation Statement
     */
    public void setDDLSql(String DDLSql) {
        this.DDLSql = DDLSql;
    }

    /**
     * Get Table permissions, default is 0: Project share; 1: Individual and administrator only 
     * @return Privilege Table permissions, default is 0: Project share; 1: Individual and administrator only
     */
    public Long getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Table permissions, default is 0: Project share; 1: Individual and administrator only
     * @param Privilege Table permissions, default is 0: Project share; 1: Individual and administrator only
     */
    public void setPrivilege(Long Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Person in Charge 
     * @return Incharge Person in Charge
     */
    public String getIncharge() {
        return this.Incharge;
    }

    /**
     * Set Person in Charge
     * @param Incharge Person in Charge
     */
    public void setIncharge(String Incharge) {
        this.Incharge = Incharge;
    }

    public CreateHiveTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHiveTableRequest(CreateHiveTableRequest source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.DDLSql != null) {
            this.DDLSql = new String(source.DDLSql);
        }
        if (source.Privilege != null) {
            this.Privilege = new Long(source.Privilege);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Incharge != null) {
            this.Incharge = new String(source.Incharge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "DDLSql", this.DDLSql);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Incharge", this.Incharge);

    }
}

