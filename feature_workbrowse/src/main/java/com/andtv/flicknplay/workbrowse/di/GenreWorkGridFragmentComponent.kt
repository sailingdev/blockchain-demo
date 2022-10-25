/*
 * Copyright (C) 2021 Flicknplay
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.andtv.flicknplay.workbrowse.di

import com.andtv.flicknplay.presentation.di.annotation.FragmentScope
import com.andtv.flicknplay.workbrowse.di.module.MovieApiModule
import com.andtv.flicknplay.workbrowse.di.module.TvShowApiModule
import com.andtv.flicknplay.workbrowse.presentation.presenter.GenreGridPresenter
import com.andtv.flicknplay.workbrowse.presentation.ui.fragment.GenreWorkGridFragment
import dagger.BindsInstance
import dagger.Subcomponent

/**
 * Copyright (C) Flicknplay 2019-08-28.
 */
@FragmentScope
@Subcomponent(
        modules = [
            MovieApiModule::class,
            TvShowApiModule::class
        ]
)
interface GenreWorkGridFragmentComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance view: GenreGridPresenter.View): GenreWorkGridFragmentComponent
    }

    fun inject(genreWorkGridFragment: GenreWorkGridFragment)
}
