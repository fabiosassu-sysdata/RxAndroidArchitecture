/*
 * Copyright (C) 2017 Sysdata S.p.A.
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

package it.sysdata.rxandroidarchitecture.base.dagger.modules;

import com.baseandroid.core.dagger.scopes.AppScope;

import dagger.Module;
import dagger.Provides;
import it.sysdata.rxandroidarchitecture.base.usecase.RetrieveWelcomeMessageUC;

/**
 * Created on 28/02/17.
 *
 * @author Umberto Marini
 */
@Module
public class AppDataModule {

    @Provides
    @AppScope
    RetrieveWelcomeMessageUC providesRetrieveWelcomeMessageUC() {
        return new RetrieveWelcomeMessageUC();
    }
}