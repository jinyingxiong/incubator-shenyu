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

package org.apache.shenyu.examples.sofa.api.entity;

import java.io.Serializable;

/**
 * Sofa simple type Bean.
 */
public class SofaSimpleTypeBean implements Serializable {

    private String id;

    private String name;

    public SofaSimpleTypeBean() {
    }

    public SofaSimpleTypeBean(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get id.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Set id.
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SofaSimpleTypeBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
