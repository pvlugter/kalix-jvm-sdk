/*
 * Copyright 2021 Lightbend Inc.
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

package com.akkaserverless.javasdk.impl.action

import com.akkaserverless.javasdk.action.ActionCreationContext
import com.akkaserverless.javasdk.impl.ActionFactory
import com.akkaserverless.javasdk.impl.ResolvedEntityFactory
import com.akkaserverless.javasdk.impl.ResolvedServiceMethod

class ResolvedActionFactory(
    delegate: ActionFactory,
    override val resolvedMethods: Map[String, ResolvedServiceMethod[_, _]])
    extends ActionFactory
    with ResolvedEntityFactory {
  override def create(context: ActionCreationContext): ActionHandler[_] =
    delegate.create(context)

}