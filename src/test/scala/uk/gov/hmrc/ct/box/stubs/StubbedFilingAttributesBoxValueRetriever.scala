/*
 * Copyright 2015 HM Revenue & Customs
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

package uk.gov.hmrc.ct.box.stubs

import uk.gov.hmrc.ct._
import uk.gov.hmrc.ct.box.CtValue
import uk.gov.hmrc.ct.box.retriever.FilingAttributesBoxValueRetriever

/**
  * Created by jameswilliams on 16/11/2015.
  */
trait StubbedFilingAttributesBoxValueRetriever extends FilingAttributesBoxValueRetriever {
  override def retrieveProductName(): ProductName = ???

  override def retrieveCompanyType(): FilingCompanyType = ???

  override def retrieveAbbreviatedAccountsFiling(): AbbreviatedAccountsFiling = ???

  override def retrieveStatutoryAccountsFiling(): StatutoryAccountsFiling = ???

  override def retrieveMicroEntityFiling(): MicroEntityFiling = ???

  override def retrieveAbridgedFiling(): AbridgedFiling = ???

  override def retrieveHMRCFiling(): HMRCFiling = ???

  override def retrieveCompaniesHouseFiling(): CompaniesHouseFiling = ???

  override def generateValues: Map[String, CtValue[_]] = ???
}
