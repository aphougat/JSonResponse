<%--
  ~ /*
  ~  *
  ~  * Copyright (c) 2015 itembryo AG
  ~  * All rights reserved.
  ~  *
  ~  * This software is the confidential and proprietary information of itembryo
  ~  * ("Confidential Information"). You shall not disclose such Confidential
  ~  * Information and shall use it only in accordance with the terms of the
  ~  * license agreement you entered into with itembryo.
  ~  *
  ~  *
  ~  */
  --%>

<html>
<body>
	<h1>Warehouses</h1>
	<h2> Available Warehouses</h2>
	<textarea>${warehouses}</textarea>
	<h2>Insert new Ware house here</h2>
	<form action="/warehouses" method="post">
		<textarea id="warehouse" name="warehouse" type="text"></textarea>

		<button id="submit" type="submit"/>
	</form>
</body>
</html>