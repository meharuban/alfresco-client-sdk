/**
 * Alfresco Search REST API
 * Provides access to the search features of Alfresco
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alfresco.client.api.search.body;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Scope
 */
public class RequestScope
{
    @SerializedName("stores")
    private List<String> stores = new ArrayList<String>();

    public RequestScope stores(List<String> stores)
    {
        this.stores = stores;
        return this;
    }

    /**
     * The stores to include in the query
     * 
     * @return stores
     **/
    public List<String> getStores()
    {
        return stores;
    }

    public void setStores(List<String> stores)
    {
        this.stores = stores;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        RequestScope requestScope = (RequestScope) o;
        return Objects.equals(this.stores, requestScope.stores);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(stores);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestScope {\n");

        sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o)
    {
        if (o == null) { return "null"; }
        return o.toString().replace("\n", "\n    ");
    }
}
