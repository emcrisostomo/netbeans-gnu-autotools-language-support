#                                               -*- Autoconf -*-
# Process this file with autoconf to produce a configure script.
#
# This file is an example Autoconf file which you can use to start configuring
# your project.
#
# You can use the autoscan utility to periodically scan your project and
# get suggestions about Autoconf macros you should add to your package
# configuration.
AC_PREREQ([2.69])
AC_INIT([package-name], [1.0.0], [mail@domain.com])
AC_COPYRIGHT([2014 (C) The Author])
AC_REVISION([$Revision: 1.0.0-1 $])
AC_CONFIG_SRCDIR([main.c])
AC_CONFIG_AUX_DIR([config])
AC_CONFIG_HEADERS([config.h])
AC_CONFIG_FILES([Makefile])
AC_CONFIG_MACRO_DIRS([m4])
AM_INIT_AUTOMAKE([-Wall -Werror gnu])

# Configure language
AC_LANG(C)     # C project
# AC_LANG(C++) # C++ project

# Checks for programs.
AC_PROG_CC([clang gcc])      # Determine a C compiler to use.
# AC_PROG_CXX([clang++ g++]) # Determine a C++ compiler to use.

# Configure C++ compiler
# AX_CXX_COMPILE_STDCXX_11(noext) # Conform to C++11 standard with no extensions
# AX_CXXFLAGS_WARN_ALL            # Enable all warnings

# Checks for libraries.

# Checks for header files.
AC_CHECK_HEADERS([stdlib.h unistd.h getopt.h]) # Check for required headers
AC_CHECK_HEADERS([CoreServices/CoreServices.h])

# Define an Automake conditional based on a previous header check result
AM_CONDITIONAL(
  [USE_CORESERVICES],
  [test "x${ac_cv_header_CoreServices_CoreServices_h}" = "xyes"])

# Checks for typedefs, structures, and compiler characteristics.
AC_CHECK_HEADER_STDBOOL
AC_TYPE_SIZE_T
AC_TYPE_UINT32_T
AC_TYPE_MODE_T

# Checks for library functions.
AC_FUNC_STRTOD
AC_CHECK_FUNCS([getopt_long])
AC_CHECK_FUNCS(
  [realpath],
  ,
  AC_MSG_ERROR([The realpath function cannot be found.])
)

# Check for additional functions in case a required header is not found
if test "x${ac_cv_header_CoreServices_CoreServices_h}" != "xyes"
then
  AC_CHECK_DECLS(
    [kqueue, kevent],
    ,
    AC_MSG_ERROR([kqueue support cannot be found.]),
    [
      AC_INCLUDES_DEFAULT
      [#include <sys/event.h>]
      [#include <sys/types.h>]
      [#include <sys/time.h>]
    ]
  )
fi

AC_OUTPUT
