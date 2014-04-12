/* 
 * Copyright (C) 2014, Enrico M. Crisostomo
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.netbeans.gnu.autotools.autoconf.lexer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.netbeans.gnu.autotools.autoconf.lexer.AutoconfKeyword.Type.UNKNOWN;

/**
 *
 * @author Enrico M. Crisostomo
 */
public final class AutoconfKeyword {

    private static final Set<String> acBuiltins;
    private static final Set<String> ahBuiltins;
    private static final Set<String> amBuiltins;
    private static final Set<String> asBuiltins;
    private static final Set<String> auBuiltins;
    private static final Set<String> acObsolete;
    private static final Set<String> amObsolete;

    static {
        acBuiltins = new HashSet<>();
        acBuiltins.add("AC_ARG_VAR");
        acBuiltins.add("AC_ARG_ENABLE");
        acBuiltins.add("AC_ARG_PROGRAM");
        acBuiltins.add("AC_ARG_WITH");
        acBuiltins.add("AC_AUTOCONF_VERSION");
        acBuiltins.add("AC_BEFORE");
        acBuiltins.add("AC_C_BACKSLASH_A");
        acBuiltins.add("AC_C_BIGENDIAN");
        acBuiltins.add("AC_C_CHAR_UNSIGNED");
        acBuiltins.add("AC_C_CONST");
        acBuiltins.add("AC_C_FLEXIBLE_ARRAY_MEMBER");
        acBuiltins.add("AC_C_INLINE");
        acBuiltins.add("AC_C_PROTOTYPES");
        acBuiltins.add("AC_C_RESTRICT");
        acBuiltins.add("AC_C_STRINGIZE");
        acBuiltins.add("AC_C_TYPEOF");
        acBuiltins.add("AC_C_VARARRAYS");
        acBuiltins.add("AC_C_VOLATILE");
        acBuiltins.add("AC_CACHE_CHECK");
        acBuiltins.add("AC_CACHE_LOAD");
        acBuiltins.add("AC_CACHE_SAVE");
        acBuiltins.add("AC_CACHE_VAL");
        acBuiltins.add("AC_CANONICAL_BUILD");
        acBuiltins.add("AC_CANONICAL_HOST");
        acBuiltins.add("AC_CANONICAL_TARGET");
        acBuiltins.add("AC_CHECK_ALIGNOF");
        acBuiltins.add("AC_CHECK_DECL");
        acBuiltins.add("AC_CHECK_DECLS");
        acBuiltins.add("AC_CHECK_DECLS_ONCE");
        acBuiltins.add("AC_CHECK_FILE");
        acBuiltins.add("AC_CHECK_FILES");
        acBuiltins.add("AC_CHECK_FUNC");
        acBuiltins.add("AC_CHECK_FUNCS");
        acBuiltins.add("AC_CHECK_FUNCS_ONCE");
        acBuiltins.add("AC_CHECK_LIB");
        acBuiltins.add("AC_CHECK_HEADER");
        acBuiltins.add("AC_CHECK_HEADER_STDBOOL");
        acBuiltins.add("AC_CHECK_HEADERS");
        acBuiltins.add("AC_CHECK_HEADERS_ONCE");
        acBuiltins.add("AC_CHECK_MEMBER");
        acBuiltins.add("AC_CHECK_MEMBERS");
        acBuiltins.add("AC_CHECK_PROG");
        acBuiltins.add("AC_CHECK_PROGS");
        acBuiltins.add("AC_CHECK_SIZEOF");
        acBuiltins.add("AC_CHECK_TARGET_TOOL");
        acBuiltins.add("AC_CHECK_TARGET_TOOLS");
        acBuiltins.add("AC_CHECK_TYPE");
        acBuiltins.add("AC_CHECK_TYPES");
        acBuiltins.add("AC_CHECK_TOOL");
        acBuiltins.add("AC_CHECK_TOOLS");
        acBuiltins.add("AC_COMPILE_IFELSE");
        acBuiltins.add("AC_COMPUTE_INT");
        acBuiltins.add("AC_CONFIG_AUX_DIR");
        acBuiltins.add("AC_CONFIG_COMMANDS");
        acBuiltins.add("AC_CONFIG_COMMANDS_PRE");
        acBuiltins.add("AC_CONFIG_COMMANDS_POST");
        acBuiltins.add("AC_CONFIG_FILES");
        acBuiltins.add("AC_CONFIG_HEADERS");
        acBuiltins.add("AC_CONFIG_LIBOBJ_DIR");
        acBuiltins.add("AC_CONFIG_LINKS");
        acBuiltins.add("AC_CONFIG_MACRO_DIR");
        acBuiltins.add("AC_CONFIG_MACRO_DIRS");
        acBuiltins.add("AC_CONFIG_SRCDIR");
        acBuiltins.add("AC_CONFIG_SUBDIRS");
        acBuiltins.add("AC_COPYRIGHT");
        acBuiltins.add("AC_DEFINE");
        acBuiltins.add("AC_DEFINE_UNQUOTED");
        acBuiltins.add("AC_DEFUN");
        acBuiltins.add("AC_DEFUN_ONCE");
        acBuiltins.add("AC_DIAGNOSE");
        acBuiltins.add("AC_DISABLE_OPTION_CHECKING");
        acBuiltins.add("AC_EGREP_CPP");
        acBuiltins.add("AC_EGREP_HEADER");
        acBuiltins.add("AC_ERLANG_CHECK_LIB");
        acBuiltins.add("AC_ERLANG_NEED_ERL");
        acBuiltins.add("AC_ERLANG_NEED_ERLC");
        acBuiltins.add("AC_ERLANG_PATH_ERL");
        acBuiltins.add("AC_ERLANG_PATH_ERLC");
        acBuiltins.add("AC_ERLANG_SUBST_ERTS_VER");
        acBuiltins.add("AC_ERLANG_SUBST_INSTALL_LIB_DIR");
        acBuiltins.add("AC_ERLANG_SUBST_INSTALL_LIB_SUBDIR");
        acBuiltins.add("AC_ERLANG_SUBST_LIB_DIR");
        acBuiltins.add("AC_ERLANG_SUBST_ROOT_DIR");
        acBuiltins.add("AC_F77_DUMMY_MAIN");
        acBuiltins.add("AC_F77_FUNC");
        acBuiltins.add("AC_F77_IMPLICIT_NONE");
        acBuiltins.add("AC_F77_LIBRARY_LDFLAGS");
        acBuiltins.add("AC_F77_MAIN");
        acBuiltins.add("AC_F77_WRAPPERS");
        acBuiltins.add("AC_FATAL");
        acBuiltins.add("AC_FC_CHECK_BOUNDS");
        acBuiltins.add("AC_FC_DUMMY_MAIN");
        acBuiltins.add("AC_FC_FIXEDFORM");
        acBuiltins.add("AC_FC_FREEFORM");
        acBuiltins.add("AC_FC_FUNC");
        acBuiltins.add("AC_FC_IMPLICIT_NONE");
        acBuiltins.add("AC_FC_LIBRARY_LDFLAGS");
        acBuiltins.add("AC_FC_LINE_LENGTH");
        acBuiltins.add("AC_FC_MAIN");
        acBuiltins.add("AC_FC_MODULE_EXTENSION");
        acBuiltins.add("AC_FC_MODULE_FLAG");
        acBuiltins.add("AC_FC_MODULE_OUTPUT_FLAG");
        acBuiltins.add("AC_FC_PP_DEFINE");
        acBuiltins.add("AC_FC_PP_SRCEXT");
        acBuiltins.add("AC_FC_SRCEXT");
        acBuiltins.add("AC_FC_WRAPPERS");
        acBuiltins.add("AC_FUNC_ALLOCA");
        acBuiltins.add("AC_FUNC_CHOWN");
        acBuiltins.add("AC_FUNC_CLOSEDIR_VOID");
        acBuiltins.add("AC_FUNC_ERROR_AT_LINE");
        acBuiltins.add("AC_FUNC_FNMATCH");
        acBuiltins.add("AC_FUNC_FNMATCH_GNU");
        acBuiltins.add("AC_FUNC_FORK");
        acBuiltins.add("AC_FUNC_FSEEKO");
        acBuiltins.add("AC_FUNC_GETGROUPS");
        acBuiltins.add("AC_FUNC_GETLOADAVG");
        acBuiltins.add("AC_FUNC_GETMNTENT");
        acBuiltins.add("AC_FUNC_GETPGRP");
        acBuiltins.add("AC_FUNC_LSTAT_FOLLOWS_SLASHED_SYMLINK");
        acBuiltins.add("AC_FUNC_MALLOC");
        acBuiltins.add("AC_FUNC_MBRTOWC");
        acBuiltins.add("AC_FUNC_MEMCMP");
        acBuiltins.add("AC_FUNC_MKTIME");
        acBuiltins.add("AC_FUNC_MMAP");
        acBuiltins.add("AC_FUNC_OBSTACK");
        acBuiltins.add("AC_FUNC_REALLOC");
        acBuiltins.add("AC_FUNC_SELECT_ARGTYPES");
        acBuiltins.add("AC_FUNC_SETPGRP");
        acBuiltins.add("AC_FUNC_STAT");
        acBuiltins.add("AC_FUNC_LSTAT");
        acBuiltins.add("AC_FUNC_STRCOLL");
        acBuiltins.add("AC_FUNC_STRERROR_R");
        acBuiltins.add("AC_FUNC_STRFTIME");
        acBuiltins.add("AC_FUNC_STRTOD");
        acBuiltins.add("AC_FUNC_STRTOLD");
        acBuiltins.add("AC_FUNC_STRNLEN");
        acBuiltins.add("AC_FUNC_UTIME_NULL");
        acBuiltins.add("AC_FUNC_VPRINTF");
        acBuiltins.add("AC_HEADER_ASSERT");
        acBuiltins.add("AC_HEADER_DIRENT");
        acBuiltins.add("AC_HEADER_MAJOR");
        acBuiltins.add("AC_HEADER_RESOLV");
        acBuiltins.add("AC_HEADER_STAT");
        acBuiltins.add("AC_HEADER_STDBOOL");
        acBuiltins.add("AC_HEADER_STDC");
        acBuiltins.add("AC_HEADER_SYS_WAIT");
        acBuiltins.add("AC_HEADER_TIME");
        acBuiltins.add("AC_HEADER_TIOCGWINSZ");
        acBuiltins.add("AC_INCLUDES_DEFAULT");
        acBuiltins.add("AC_INIT");
        acBuiltins.add("AC_LANG");
        acBuiltins.add("AC_LANG_ASSERT");
        acBuiltins.add("AC_LANG_CALL");
        acBuiltins.add("AC_LANG_CONFTEST");
        acBuiltins.add("AC_LANG_DEFINES_PROVIDED");
        acBuiltins.add("AC_LANG_FUNC_LINK_TRY");
        acBuiltins.add("AC_LANG_POP");
        acBuiltins.add("AC_LANG_PROGRAM");
        acBuiltins.add("AC_LANG_PUSH");
        acBuiltins.add("AC_LANG_SOURCE");
        acBuiltins.add("AC_LANG_WERROR");
        acBuiltins.add("AC_LIBOBJ");
        acBuiltins.add("AC_LIBSOURCE");
        acBuiltins.add("AC_LIBSOURCES");
        acBuiltins.add("AC_LINK_IFELSE");
        acBuiltins.add("AC_MSG_CHECKING");
        acBuiltins.add("AC_MSG_ERROR");
        acBuiltins.add("AC_MSG_FAILURE");
        acBuiltins.add("AC_MSG_NOTICE");
        acBuiltins.add("AC_MSG_RESULT");
        acBuiltins.add("AC_MSG_WARN");
        acBuiltins.add("AC_OPENMP");
        acBuiltins.add("AC_OUTPUT");
        acBuiltins.add("AC_PACKAGE_BUGREPORT");
        acBuiltins.add("AC_PACKAGE_NAME");
        acBuiltins.add("AC_PACKAGE_STRING");
        acBuiltins.add("AC_PACKAGE_TARNAME");
        acBuiltins.add("AC_PACKAGE_URL");
        acBuiltins.add("AC_PACKAGE_VERSION");
        acBuiltins.add("AC_PATH_PROG");
        acBuiltins.add("AC_PATH_PROGS");
        acBuiltins.add("AC_PATH_PROGS_FEATURE_CHECK");
        acBuiltins.add("AC_PATH_TARGET_TOOL");
        acBuiltins.add("AC_PATH_TOOL");
        acBuiltins.add("AC_PATH_X");
        acBuiltins.add("AC_PATH_XTRA");
        acBuiltins.add("AC_PREFIX_DEFAULT");
        acBuiltins.add("AC_PREFIX_PROGRAM");
        acBuiltins.add("AC_PREPROC_IFELSE");
        acBuiltins.add("AC_PREREQ");
        acBuiltins.add("AC_PRESERVE_HELP_ORDER");
        acBuiltins.add("AC_PROG_AWK");
        acBuiltins.add("AC_PROG_CC");
        acBuiltins.add("AC_PROG_CC_C_O");
        acBuiltins.add("AC_PROG_CC_C89");
        acBuiltins.add("AC_PROG_CC_C99");
        acBuiltins.add("AC_PROG_CC_STDC");
        acBuiltins.add("AC_PROG_CPP");
        acBuiltins.add("AC_PROG_CPP_WERROR");
        acBuiltins.add("AC_PROG_CXX");
        acBuiltins.add("AC_PROG_CXX_C_O");
        acBuiltins.add("AC_PROG_CXXCPP");
        acBuiltins.add("AC_PROG_EGREP");
        acBuiltins.add("AC_PROG_F77");
        acBuiltins.add("AC_PROG_F77_C_O");
        acBuiltins.add("AC_PROG_FC");
        acBuiltins.add("AC_PROG_FC_C_O");
        acBuiltins.add("AC_PROG_FGREP");
        acBuiltins.add("AC_PROG_GCC_TRADITIONAL");
        acBuiltins.add("AC_PROG_GO");
        acBuiltins.add("AC_PROG_GREP");
        acBuiltins.add("AC_PROG_INSTALL");
        acBuiltins.add("AC_PROG_LEX");
        acBuiltins.add("AC_PROG_LN_S");
        acBuiltins.add("AC_PROG_MAKE_SET");
        acBuiltins.add("AC_PROG_MKDIR_P");
        acBuiltins.add("AC_PROG_OBJC");
        acBuiltins.add("AC_PROG_OBJCPP");
        acBuiltins.add("AC_PROG_OBJCXX");
        acBuiltins.add("AC_PROG_OBJCXXCPP");
        acBuiltins.add("AC_PROG_RANLIB");
        acBuiltins.add("AC_PROG_SED");
        acBuiltins.add("AC_PROG_YACC");
        acBuiltins.add("AC_REPLACE_FNMATCH");
        acBuiltins.add("AC_REPLACE_FUNCS");
        acBuiltins.add("AC_REQUIRE");
        acBuiltins.add("AC_REQUIRE_AUX_FILE");
        acBuiltins.add("AC_REQUIRE_CPP");
        acBuiltins.add("AC_REVISION");
        acBuiltins.add("AC_RUN_IFELSE");
        acBuiltins.add("AC_SEARCH_LIBS");
        acBuiltins.add("AC_STRUCT_DIRENT_D_INO");
        acBuiltins.add("AC_STRUCT_DIRENT_D_TYPE");
        acBuiltins.add("AC_STRUCT_ST_BLOCKS");
        acBuiltins.add("AC_STRUCT_TM");
        acBuiltins.add("AC_STRUCT_TIMEZONE");
        acBuiltins.add("AC_SUBST");
        acBuiltins.add("AC_SUBST_FILE");
        acBuiltins.add("AC_SYS_INTERPRETER");
        acBuiltins.add("AC_SYS_LARGEFILE");
        acBuiltins.add("AC_SYS_LONG_FILE_NAMES");
        acBuiltins.add("AC_SYS_POSIX_TERMIOS");
        acBuiltins.add("AC_TYPE_GETGROUPS");
        acBuiltins.add("AC_TYPE_INT8_T");
        acBuiltins.add("AC_TYPE_INT16_T");
        acBuiltins.add("AC_TYPE_INT32_T");
        acBuiltins.add("AC_TYPE_INT64_T");
        acBuiltins.add("AC_TYPE_INTMAX_T");
        acBuiltins.add("AC_TYPE_INTPTR_T");
        acBuiltins.add("AC_TYPE_LONG_DOUBLE");
        acBuiltins.add("AC_TYPE_LONG_DOUBLE_WIDER");
        acBuiltins.add("AC_TYPE_LONG_LONG_INT");
        acBuiltins.add("AC_TYPE_MBSTATE_T");
        acBuiltins.add("AC_TYPE_MODE_T");
        acBuiltins.add("AC_TYPE_OFF_T");
        acBuiltins.add("AC_TYPE_PID_T");
        acBuiltins.add("AC_TYPE_SIZE_T");
        acBuiltins.add("AC_TYPE_SSIZE_T");
        acBuiltins.add("AC_TYPE_UID_T");
        acBuiltins.add("AC_TYPE_UINT8_T");
        acBuiltins.add("AC_TYPE_UINT16_T");
        acBuiltins.add("AC_TYPE_UINT32_T");
        acBuiltins.add("AC_TYPE_UINT64_T");
        acBuiltins.add("AC_TYPE_UINTMAX_T");
        acBuiltins.add("AC_TYPE_UINTPTR_T");
        acBuiltins.add("AC_TYPE_UNSIGNED_LONG_LONG_INT");
        acBuiltins.add("AC_USE_SYSTEM_EXTENSIONS");
        acBuiltins.add("AC_WARNING");

        acObsolete = new HashSet<>();
        acObsolete.add("AC_AIX");
        acObsolete.add("AC_ALLOCA");
        acObsolete.add("AC_ARG_ARRAY");
        acObsolete.add("AC_C_CROSS");
        acObsolete.add("AC_C_LONG_DOUBLE");
        acObsolete.add("AC_CANONICAL_SYSTEM");
        acObsolete.add("AC_CHAR_UNSIGNED");
        acObsolete.add("AC_CHECKING");
        acObsolete.add("AC_COMPILE_CHECK");
        acObsolete.add("AC_CONST");
        acObsolete.add("AC_CROSS_CHECK");
        acObsolete.add("AC_CYGWIN");
        acObsolete.add("AC_DECL_SYS_SIGLIST");
        acObsolete.add("AC_DECL_YYTEXT");
        acObsolete.add("AC_DIR_HEADER");
        acObsolete.add("AC_DYNIX_SEQ");
        acObsolete.add("AC_EXEEXT");
        acObsolete.add("AC_EMXOS2");
        acObsolete.add("AC_ENABLE");
        acObsolete.add("AC_ERROR");
        acObsolete.add("AC_FIND_X");
        acObsolete.add("AC_FIND_XTRA");
        acObsolete.add("AC_FOREACH");
        acObsolete.add("AC_FUNC_CHECK");
        acObsolete.add("AC_FUNC_SETVBUF_REVERSED");
        acObsolete.add("AC_FUNC_WAIT3");
        acObsolete.add("AC_GCC_TRADITIONAL");
        acObsolete.add("AC_GETGROUPS_T");
        acObsolete.add("AC_GETLOADAVG");
        acObsolete.add("AC_GNU_SOURCE");
        acObsolete.add("AC_HAVE_FUNCS");
        acObsolete.add("AC_HAVE_HEADERS");
        acObsolete.add("AC_HAVE_LIBRARY");
        acObsolete.add("AC_HAVE_POUNDBANG");
        acObsolete.add("AC_HEADER_CHECK");
        acObsolete.add("AC_HEADER_EGREP");
        acObsolete.add("AC_HELP_STRING");
        acObsolete.add("AC_INLINE");
        acObsolete.add("AC_INT_16_BITS");
        acObsolete.add("AC_IRIX_SUN");
        acObsolete.add("AC_ISC_POSIX");
        acObsolete.add("AC_LANG_C");
        acObsolete.add("AC_LANG_CPLUSPLUS");
        acObsolete.add("AC_LANG_FORTRAN77");
        acObsolete.add("AC_LANG_RESTORE");
        acObsolete.add("AC_LANG_SAVE");
        acObsolete.add("AC_LINK_FILES");
        acObsolete.add("AC_LN_S");
        acObsolete.add("AC_LONG_64_BITS");
        acObsolete.add("AC_LONG_DOUBLE");
        acObsolete.add("AC_LONG_FILE_NAMES");
        acObsolete.add("AC_MAJOR_HEADER");
        acObsolete.add("AC_MEMORY_H");
        acObsolete.add("AC_MINGW32");
        acObsolete.add("AC_MINIX");
        acObsolete.add("AC_MINUS_C_MINUS_O");
        acObsolete.add("AC_MMAP");
        acObsolete.add("AC_MODE_T");
        acObsolete.add("AC_OBJEXT");
        acObsolete.add("AC_OBSOLETE");
        acObsolete.add("AC_OFF_T");
        acObsolete.add("AC_OUTPUT_COMMANDS");
        acObsolete.add("AC_PID_T");
        acObsolete.add("AC_PREFIX");
        acObsolete.add("AC_PROGRAMS_CHECK");
        acObsolete.add("AC_PROGRAMS_PATH");
        acObsolete.add("AC_PROGRAM_CHECK");
        acObsolete.add("AC_PROGRAM_EGREP");
        acObsolete.add("AC_PROGRAM_PATH");
        acObsolete.add("AC_REMOTE_TAPE");
        acObsolete.add("AC_RESTARTABLE_SYSCALLS");
        acObsolete.add("AC_RETSIGTYPE");
        acObsolete.add("AC_RSH");
        acObsolete.add("AC_SCO_INTL");
        acObsolete.add("AC_SETVBUF_REVERSED");
        acObsolete.add("AC_SET_MAKE");
        acObsolete.add("AC_SIZEOF_TYPE");
        acObsolete.add("AC_SIZE_T");
        acObsolete.add("AC_STAT_MACROS_BROKEN");
        acObsolete.add("AC_STDC_HEADERS");
        acObsolete.add("AC_STRCOLL");
        acObsolete.add("AC_STRUCT_ST_BLKSIZE");
        acObsolete.add("AC_STRUCT_ST_RDEV");
        acObsolete.add("AC_ST_BLKSIZE");
        acObsolete.add("AC_ST_BLOCKS");
        acObsolete.add("AC_ST_RDEV");
        acObsolete.add("AC_SYS_RESTARTABLE_SYSCALLS");
        acObsolete.add("AC_SYS_SIGLIST_DECLARED");
        acObsolete.add("AC_TEST_CPP");
        acObsolete.add("AC_TEST_PROGRAM");
        acObsolete.add("AC_TIMEZONE");
        acObsolete.add("AC_TIME_WITH_SYS_TIME");
        acObsolete.add("AC_TRY_COMPILE");
        acObsolete.add("AC_TRY_CPP");
        acObsolete.add("AC_TRY_LINK");
        acObsolete.add("AC_TRY_LINK_FUNC");
        acObsolete.add("AC_TRY_RUN");
        acObsolete.add("AC_TYPE_SIGNAL");
        acObsolete.add("AC_UID_T");
        acObsolete.add("AC_UNISTD_H");
        acObsolete.add("AC_USG");
        acObsolete.add("AC_UTIME_NULL");
        acObsolete.add("AC_VALIDATE_CACHED_SYSTEM_TUPLE");
        acObsolete.add("AC_VERBOSE");
        acObsolete.add("AC_VFORK");
        acObsolete.add("AC_VPRINTF");
        acObsolete.add("AC_WAIT3");
        acObsolete.add("AC_WARN");
        acObsolete.add("AC_WITH");
        acObsolete.add("AC_WORDS_BIGENDIAN");
        acObsolete.add("AC_XENIX_DIR");
        acObsolete.add("AC_YYTEXT_POINTER");

        ahBuiltins = new HashSet<>();
        ahBuiltins.add("AH_BOTTOM");
        ahBuiltins.add("AH_HEADER");
        ahBuiltins.add("AH_TEMPLATE");
        ahBuiltins.add("AH_TOP");
        ahBuiltins.add("AH_VERBATIM");

        amBuiltins = new HashSet<>();
        amBuiltins.add("AM_INIT_AUTOMAKE");
        amBuiltins.add("AM_CONDITIONAL");
        amBuiltins.add("AM_PATH_LISPDIR");
        amBuiltins.add("AM_PROG_AR");
        amBuiltins.add("AM_PROG_AS");
        amBuiltins.add("AM_PROG_CC_C_O");
        amBuiltins.add("AM_PROG_LEX");
        amBuiltins.add("AM_PROG_GCJ");
        amBuiltins.add("AM_PROG_UPC");
        amBuiltins.add("AM_MISSING_PROG");
        amBuiltins.add("AM_SILENT_RULES");
        amBuiltins.add("AM_WITH_DMALLOC");

        amObsolete = new HashSet<>();
        amObsolete.add("AM_PROG_MKDIR_P");

        asBuiltins = new HashSet<>();
        asBuiltins.add("AS_BOURNE_COMPATIBLE");
        asBuiltins.add("AS_BOX");
        asBuiltins.add("AS_CASE");
        asBuiltins.add("AS_DIRNAME");
        asBuiltins.add("AS_ECHO");
        asBuiltins.add("AS_ECHO_N");
        asBuiltins.add("AS_ESCAPE");
        asBuiltins.add("AS_EXECUTABLE_P");
        asBuiltins.add("AS_EXIT");
        asBuiltins.add("AS_HELP_STRING");
        asBuiltins.add("AS_IF");
        asBuiltins.add("AS_INIT");
        asBuiltins.add("AS_INIT_GENERATED");
        asBuiltins.add("AS_LINENO_PREPARE");
        asBuiltins.add("AS_LITERAL_IF");
        asBuiltins.add("AS_LITERAL_WORD_IF");
        asBuiltins.add("AS_ME_PREPARE");
        asBuiltins.add("AS_MESSAGE_FD");
        asBuiltins.add("AS_MESSAGE_LOG_FD");
        asBuiltins.add("AS_MKDIR_P");
        asBuiltins.add("AS_ORIGINAL_STDIN_FD");
        asBuiltins.add("AS_SET_CATFILE");
        asBuiltins.add("AS_SET_STATUS");
        asBuiltins.add("AS_SHELL_SANITIZE");
        asBuiltins.add("AS_TMPDIR");
        asBuiltins.add("AS_TR_CPP");
        asBuiltins.add("AS_TR_SH");
        asBuiltins.add("AS_UNSET");
        asBuiltins.add("AS_VAR_APPEND");
        asBuiltins.add("AS_VAR_ARITH");
        asBuiltins.add("AS_VAR_COPY");
        asBuiltins.add("AS_VAR_IF");
        asBuiltins.add("AS_VAR_POPDEF");
        asBuiltins.add("AS_VAR_PUSHDEF");
        asBuiltins.add("AS_VAR_SET");
        asBuiltins.add("AS_VAR_SET_IF");
        asBuiltins.add("AS_VAR_TEST_SET");
        asBuiltins.add("AS_VERSION_COMPARE");

        auBuiltins = new HashSet<>();
        auBuiltins.add("AU_ALIAS");
        auBuiltins.add("AU_DEFUN");
    }

    private AutoconfKeyword() {
    }

    public static Type getType(String identifier) {
        if (identifier == null) {
            return UNKNOWN;
        }

        if (acBuiltins.contains(identifier)) {
            return Type.AC_BUILTIN;
        }
        if (ahBuiltins.contains(identifier)) {
            return Type.AH_BUILTIN;
        }
        if (amBuiltins.contains(identifier)) {
            return Type.AM_BUILTIN;
        }
        if (asBuiltins.contains(identifier)) {
            return Type.AS_BUILTIN;
        }
        if (acObsolete.contains(identifier)) {
            return Type.AC_OBSOLETE;
        }
        if (amObsolete.contains(identifier)) {
            return Type.AC_OBSOLETE;
        }

        for (Type t : Type.getTypesWithPrefix()) {
            for (String prefix : t.prefixes) {
                if (identifier.startsWith(prefix)) {
                    return t;
                }
            }
        }

        return UNKNOWN;
    }

    public static enum Type {

        AC_BUILTIN,
        AH_BUILTIN,
        AM_BUILTIN,
        AS_BUILTIN,
        AU_BUILTIN,
        AC_OBSOLETE,
        AM_OBSOLETE,
        AC_GENERIC(new String[]{"AC_", "_AC_"}),
        AH_GENERIC(new String[]{"AH_", "_AH_"}),
        AM_GENERIC(new String[]{"AM_", "_AM_"}),
        AN_GENERIC(new String[]{"AN_", "_AN_"}),
        AS_GENERIC(new String[]{"AS_", "_AS_"}),
        AU_GENERIC(new String[]{"AU_", "_AU_"}),
        AX_GENERIC(new String[]{"AX_", "_AX_"}),
        UNKNOWN;

        private static final List<Type> withPrefix;

        static {
            List<Type> lstWithPrefix = new ArrayList<>();

            for (Type t : Type.values()) {
                if (t.prefixes != null) {
                    lstWithPrefix.add(t);
                }
            }

            withPrefix = Collections.unmodifiableList(lstWithPrefix);
        }

        private final String[] prefixes;

        private Type(String[] prefixes) {
            this.prefixes = prefixes;
        }

        private Type() {
            this.prefixes = null;
        }

        private static List<Type> getTypesWithPrefix() {
            return withPrefix;
        }
    }
}
