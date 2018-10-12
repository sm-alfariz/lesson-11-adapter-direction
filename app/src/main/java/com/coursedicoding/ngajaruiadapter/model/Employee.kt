/*************************************************
 * Created by Efendi Hariyadi on 10/10/18 10:10 PM
 * Copyright (c) 2018 . All rights reserved.
 * Last modified 10/10/18 10:10 PM
 */

package com.coursedicoding.ngajaruiadapter.model

import org.jetbrains.annotations.Nullable

object ModelEmployee {
    data class Employee(
            val namaLengkap: String,
            val phoneNumber: String,
            val umur: Int?,
            var photo: Int?,
            var vote: Float?,
            var empDetail: EmployeeDetail? = null
    )
    data class EmployeeDetail(
            @Nullable
            val skils: List<EmpSkils>? = null
    )

    data class EmpSkils(
            val skilsName: String? = null,
            val skilsSkor: Int? = null
    )
}

