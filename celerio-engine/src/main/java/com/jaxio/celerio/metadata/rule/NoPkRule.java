/*
 * Copyright 2015 JAXIO http://www.jaxio.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jaxio.celerio.metadata.rule;

import com.jaxio.celerio.configuration.database.Table;
import com.jaxio.celerio.metadata.AbstractMetaDataRule;
import com.jaxio.celerio.metadata.RuleReport;
import org.springframework.stereotype.Service;

@Service
public class NoPkRule extends AbstractMetaDataRule<Table> {

    @Override
    public boolean validate(Table t, RuleReport report) {
        return true;
    }

}