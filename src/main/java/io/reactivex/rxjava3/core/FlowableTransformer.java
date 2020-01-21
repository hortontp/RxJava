/**
 * Copyright (c) 2016-present, RxJava Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

package io.reactivex.rxjava3.core;

import org.reactivestreams.Publisher;

import io.reactivex.rxjava3.annotations.NonNull;

import java.util.function.Function;

/**
 * Interface to compose Flowables.
 *
 * @param <Upstream> the upstream value type
 * @param <Downstream> the downstream value type
 */
@FunctionalInterface
public interface FlowableTransformer<Upstream, Downstream> extends Function<Flowable<Upstream>, Publisher<Downstream>> {
    /**
     * Applies a function to the upstream Flowable and returns a Publisher with
     * optionally different element type.
     * @param upstream the upstream Flowable instance
     * @return the transformed Publisher instance
     */
    @NonNull
    @Override
    Publisher<Downstream> apply(@NonNull Flowable<Upstream> upstream);
}
